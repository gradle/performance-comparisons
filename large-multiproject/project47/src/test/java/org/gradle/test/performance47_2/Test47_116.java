package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_116 {
    private final Production47_116 production = new Production47_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}