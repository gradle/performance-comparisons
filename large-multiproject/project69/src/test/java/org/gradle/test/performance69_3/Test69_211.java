package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_211 {
    private final Production69_211 production = new Production69_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}