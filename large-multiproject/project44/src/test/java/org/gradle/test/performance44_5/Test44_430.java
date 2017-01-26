package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_430 {
    private final Production44_430 production = new Production44_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}