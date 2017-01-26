package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_453 {
    private final Production4_453 production = new Production4_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}