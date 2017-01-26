package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_453 {
    private final Production16_453 production = new Production16_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}