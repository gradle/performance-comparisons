package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_262 {
    private final Production69_262 production = new Production69_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}