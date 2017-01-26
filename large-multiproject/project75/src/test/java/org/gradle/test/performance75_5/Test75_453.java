package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_453 {
    private final Production75_453 production = new Production75_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}