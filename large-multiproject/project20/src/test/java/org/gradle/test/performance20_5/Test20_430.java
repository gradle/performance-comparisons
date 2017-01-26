package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_430 {
    private final Production20_430 production = new Production20_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}