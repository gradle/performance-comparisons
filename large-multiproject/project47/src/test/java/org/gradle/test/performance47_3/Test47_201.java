package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_201 {
    private final Production47_201 production = new Production47_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}