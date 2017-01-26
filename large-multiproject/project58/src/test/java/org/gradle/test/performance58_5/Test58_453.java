package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_453 {
    private final Production58_453 production = new Production58_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}