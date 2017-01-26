package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_408 {
    private final Production69_408 production = new Production69_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}