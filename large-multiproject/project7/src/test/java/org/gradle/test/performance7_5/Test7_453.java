package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_453 {
    private final Production7_453 production = new Production7_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}