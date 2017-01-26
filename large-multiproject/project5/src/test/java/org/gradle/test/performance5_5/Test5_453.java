package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_453 {
    private final Production5_453 production = new Production5_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}