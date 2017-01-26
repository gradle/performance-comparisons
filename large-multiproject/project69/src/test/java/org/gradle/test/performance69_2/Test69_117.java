package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_117 {
    private final Production69_117 production = new Production69_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}