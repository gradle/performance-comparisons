package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_245 {
    private final Production69_245 production = new Production69_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}