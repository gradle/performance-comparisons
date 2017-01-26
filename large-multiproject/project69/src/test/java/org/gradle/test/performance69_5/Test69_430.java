package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_430 {
    private final Production69_430 production = new Production69_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}