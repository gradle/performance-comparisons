package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_478 {
    private final Production69_478 production = new Production69_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}