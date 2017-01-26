package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_453 {
    private final Production84_453 production = new Production84_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}