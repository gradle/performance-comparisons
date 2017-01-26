package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_462 {
    private final Production47_462 production = new Production47_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}