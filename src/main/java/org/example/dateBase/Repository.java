package org.example.dateBase;

public interface Repository<T> {
    void save(T text);

    T readLog();
}
