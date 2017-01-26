package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_453 {
    private final Production30_453 production = new Production30_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}