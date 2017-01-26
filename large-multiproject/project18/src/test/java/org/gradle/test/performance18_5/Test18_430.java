package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_430 {
    private final Production18_430 production = new Production18_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}