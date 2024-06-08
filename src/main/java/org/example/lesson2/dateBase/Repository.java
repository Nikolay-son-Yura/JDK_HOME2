package org.example.lesson2.dateBase;

public interface Repository<T> {
    void save(T text);

    T readLog();
}
