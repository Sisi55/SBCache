package com.example.cache;

public interface MemberRepository {

    Member findByNameNoCache(String name);
    Member findByNameCache(String name);
    void refresh(String name);
}
