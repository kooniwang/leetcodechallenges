package dataStructures.recursion;

import dataStructures.utilClasses.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_SwapNodesinPairs_24 {
    @Test
    void testCaseNullInput(){
        ListNode head = new ListNode();
        ListNode expected = new ListNode();

        SwapNodesinPairs_24 var = new SwapNodesinPairs_24();
        ListNode result = var.swapPairs(head);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }

    @Test
    void testCaseOneInput(){
        ListNode head = new ListNode(1);
        ListNode expected = new ListNode(1);

        SwapNodesinPairs_24 var = new SwapNodesinPairs_24();
        ListNode result = var.swapPairs(head);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }
    @Test
    void testCaseEvenNumberNodes(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expected = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));

        SwapNodesinPairs_24 var = new SwapNodesinPairs_24();
        ListNode result = var.swapPairs(head);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }

    @Test
    void testCaseOddNumberNodes(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode expected = new ListNode(2, new ListNode(1, new ListNode(3)));

        SwapNodesinPairs_24 var = new SwapNodesinPairs_24();
        ListNode result = var.swapPairs(head);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }

// test cases for recursion solution
    @Test
    void testCaseNullInput4Recursion(){
        ListNode head = new ListNode();
        ListNode expected = new ListNode();

        SwapNodesinPairs_24 var = new SwapNodesinPairs_24();
        ListNode result = var.swapPairsRecursion(head);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }

    @Test
    void testCaseOneInput4Recursion(){
        ListNode head = new ListNode(1);
        ListNode expected = new ListNode(1);

        SwapNodesinPairs_24 var = new SwapNodesinPairs_24();
        ListNode result = var.swapPairsRecursion(head);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }
    @Test
    void testCaseEvenNumberNodes4Recursion(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expected = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));

        SwapNodesinPairs_24 var = new SwapNodesinPairs_24();
        ListNode result = var.swapPairsRecursion(head);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }

    @Test
    void testCaseOddNumberNodes4Recursion(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode expected = new ListNode(2, new ListNode(1, new ListNode(3)));

        SwapNodesinPairs_24 var = new SwapNodesinPairs_24();
        ListNode result = var.swapPairsRecursion(head);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }

}