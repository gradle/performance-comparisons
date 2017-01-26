package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_141 {
    private final Production69_141 production = new Production69_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}