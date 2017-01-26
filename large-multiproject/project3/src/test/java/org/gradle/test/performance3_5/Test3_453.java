package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_453 {
    private final Production3_453 production = new Production3_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}