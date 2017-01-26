package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_132 {
    private final Production69_132 production = new Production69_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}