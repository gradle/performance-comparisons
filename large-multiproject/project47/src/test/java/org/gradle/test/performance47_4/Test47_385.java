package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_385 {
    private final Production47_385 production = new Production47_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}