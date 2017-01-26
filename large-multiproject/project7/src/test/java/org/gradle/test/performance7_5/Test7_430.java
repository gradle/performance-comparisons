package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_430 {
    private final Production7_430 production = new Production7_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}