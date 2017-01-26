package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_430 {
    private final Production37_430 production = new Production37_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}