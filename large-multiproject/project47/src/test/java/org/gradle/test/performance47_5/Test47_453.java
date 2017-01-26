package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_453 {
    private final Production47_453 production = new Production47_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}