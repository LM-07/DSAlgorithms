package net.tekrei;

import java.util.List;

import net.tekrei.ds.impl.BinarySearchTree;

public class BSTreeTest {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		List<Integer> integerList = SortingTest.generateIntegerList(10);
		System.out.println(integerList);
		for (Integer i : integerList) {
			tree.insert(i);
		}
		System.out.println(tree.size());
		System.out.println(tree);
		System.out.println(tree.postorderTraversal());
		System.out.println(tree.preorderTraversal());
		tree.insert(15);
		System.out.println(tree);
		tree.remove(15);
		System.out.println(tree);
		tree.insert(5);
		System.out.println(tree);
		System.out.println(tree.find(5));
		System.out.println(tree.contains(5));
		tree.remove(5);
		System.out.println(tree.contains(5));
		System.out.println(tree);
		System.out.println(tree.findMin());
		tree.print();
	}

}
