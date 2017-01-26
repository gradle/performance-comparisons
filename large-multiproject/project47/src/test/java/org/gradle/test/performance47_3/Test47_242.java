package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_242 {
    private final Production47_242 production = new Production47_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}