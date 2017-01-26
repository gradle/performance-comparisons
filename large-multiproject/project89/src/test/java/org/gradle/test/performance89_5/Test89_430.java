package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_430 {
    private final Production89_430 production = new Production89_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}