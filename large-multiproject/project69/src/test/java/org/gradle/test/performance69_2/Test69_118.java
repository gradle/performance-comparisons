package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_118 {
    private final Production69_118 production = new Production69_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}