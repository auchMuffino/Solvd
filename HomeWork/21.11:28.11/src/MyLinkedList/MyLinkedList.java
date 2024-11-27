package MyLinkedList;

import java.util.*;
import java.util.function.UnaryOperator;

public class MyLinkedList<T> implements List {
    private int length = 0;
    private linkedNode<T> first = null;
    private linkedNode<T> tail = null;

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        if(length>0)
            return false;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        linkedNode<T> newNode =  new linkedNode<T>((T) o,null,tail);
        this.tail.next = newNode;
        this.tail = newNode;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        linkedNode<T> searchingfor = first;
        while(!o.equals(searchingfor.value)){
            searchingfor = searchingfor.next;
        }
        if(searchingfor.equals(o)){
            linkedNode<T> prev = searchingfor.previous;
            linkedNode<T> next = searchingfor.next;
            prev.next = next;
            next.previous = prev;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        linkedNode<T> obj = first;
        if(index>size()){
            throw new IndexOutOfBoundsException();
        }
        for(int i = 0;i < index; i++){
            obj = obj.next;
        }
        return obj;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public Spliterator spliterator() {
        return List.super.spliterator();
    }

    @Override
    public void addFirst(Object o) {
        List.super.addFirst(o);
    }

    @Override
    public void addLast(Object o) {
        List.super.addLast(o);
    }

    @Override
    public Object getFirst() {
        return List.super.getFirst();
    }

    @Override
    public Object getLast() {
        return List.super.getLast();
    }

    @Override
    public Object removeFirst() {
        return List.super.removeFirst();
    }

    @Override
    public Object removeLast() {
        return List.super.removeLast();
    }

    @Override
    public List reversed() {
        return List.super.reversed();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    class linkedNode<T>{
        private T value;
        private linkedNode<T> next;
        private linkedNode<T> previous;

        linkedNode(T value, linkedNode<T> nextNode, linkedNode<T> previousNode){
            this.value = value;
            this.next = nextNode;
            this.previous = previousNode;
        }

        public linkedNode<T> getNextNode() {
            return next;
        }

        public linkedNode<T> getPreviousNode() {
            return previous;
        }
    }

    public int getLength() {
        return length;
    }

//    public void add(T value){
//        this.tail = new linkedNode<T>(value, null, tail);
//        if(length == 0){
//            first = new linkedNode<T>(value, null, tail);
//        }
//        length++;
//    }
}