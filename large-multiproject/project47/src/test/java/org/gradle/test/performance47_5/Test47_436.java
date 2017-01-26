package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_436 {
    private final Production47_436 production = new Production47_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}