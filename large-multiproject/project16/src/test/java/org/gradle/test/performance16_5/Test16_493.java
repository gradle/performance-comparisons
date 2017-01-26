package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_493 {
    private final Production16_493 production = new Production16_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}