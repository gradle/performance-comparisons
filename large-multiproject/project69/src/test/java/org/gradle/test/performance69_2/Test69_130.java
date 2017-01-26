package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_130 {
    private final Production69_130 production = new Production69_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}