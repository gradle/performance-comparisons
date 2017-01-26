package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_79 {
    private final Production47_79 production = new Production47_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}