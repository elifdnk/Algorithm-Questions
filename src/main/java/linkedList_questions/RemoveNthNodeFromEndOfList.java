package linkedList_questions;

public class RemoveNthNodeFromEndOfList {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Adım 1: Başlangıç düğümünü gösteren head işaretçisini oluşturun.
        ListNode current = head;
        int length = 0;

        // Adım 2: Listenin uzunluğunu hesaplayın.
        while (current != null) {
            length++;
            current = current.next;
        }

        // Adım 3: Sondan n. elemanı kaldırın.
        if (n > length || n <= 0) {
            // Hata: n, listenin uzunluğundan büyük veya eşit olmalıdır.
            return head;
        }

        // Özel durum: Sondan n. eleman listenin başıysa, başı değiştirmemiz gerekir.
        if (n == length) {
            return head.next;
        }

        current = head;
        int stepsToMove = length - n - 1;

        // current işaretçisini sondan n. elemana getirin.
        for (int i = 0; i < stepsToMove; i++) {
            current = current.next;
        }

        // current.next'i bir sonraki düğümünü atlayacak şekilde güncelleyin.
        current.next = current.next.next;

        // Adım 4: Güncellenmiş bağlı listeyi döndürün.
        return head;


    }


}
/*
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 */