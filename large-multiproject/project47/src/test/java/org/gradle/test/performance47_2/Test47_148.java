package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_148 {
    private final Production47_148 production = new Production47_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}