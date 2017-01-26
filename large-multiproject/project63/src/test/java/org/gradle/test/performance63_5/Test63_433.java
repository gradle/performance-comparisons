package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_433 {
    private final Production63_433 production = new Production63_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}