package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_433 {
    private final Production44_433 production = new Production44_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}