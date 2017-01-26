package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_430 {
    private final Production63_430 production = new Production63_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}