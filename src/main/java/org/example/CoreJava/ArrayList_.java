package org.example.CoreJava;

public class ArrayList_<T> {
    T[] var;
    int size = 0;

    public ArrayList_() {
        var = (T[]) new Object[10];
    }

    public ArrayList_(int n) {
        var = (T[]) new Object[n];
    }

    public void add(T element) {
        var[size++] = element;
        increaseCapacity();
    }

    public T get(int index) {
        checkIndex(index);
        return var[index];
    }

    public int size() {
        return size;
    }

    public T remove(int index) {
        checkIndex(index);
        T oldValue =  var[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(var, index + 1, var, index, numMoved);
        }
        var[--size] = null;
        return oldValue;
    }

    public void increaseCapacity() {
        if (size == var.length - 2) {
            int newCapacity = var.length * 2;
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy(var, 0, newArray, 0, size);
            var = newArray;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    public void set(int index, T element) {
        checkIndex(index);
        var[index] = element;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            var[i] = null;
        }
        size = 0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(var[i]);
            if (i < size - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }


}
