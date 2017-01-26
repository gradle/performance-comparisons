package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_129 {
    private final Production69_129 production = new Production69_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}