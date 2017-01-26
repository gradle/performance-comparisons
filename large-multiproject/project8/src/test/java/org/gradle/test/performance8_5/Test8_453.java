package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_453 {
    private final Production8_453 production = new Production8_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}