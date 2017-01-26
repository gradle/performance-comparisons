package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_82 {
    private final Production12_82 production = new Production12_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}