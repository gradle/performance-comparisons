package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_159 {
    private final Production69_159 production = new Production69_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}