package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_94 {
    private final Production47_94 production = new Production47_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}