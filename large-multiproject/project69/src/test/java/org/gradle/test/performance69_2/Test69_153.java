package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_153 {
    private final Production69_153 production = new Production69_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}