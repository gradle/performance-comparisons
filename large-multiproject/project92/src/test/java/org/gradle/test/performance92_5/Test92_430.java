package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_430 {
    private final Production92_430 production = new Production92_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}