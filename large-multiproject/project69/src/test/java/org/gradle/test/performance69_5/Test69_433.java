package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_433 {
    private final Production69_433 production = new Production69_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}