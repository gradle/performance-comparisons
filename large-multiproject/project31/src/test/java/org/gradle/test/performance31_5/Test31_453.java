package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_453 {
    private final Production31_453 production = new Production31_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}