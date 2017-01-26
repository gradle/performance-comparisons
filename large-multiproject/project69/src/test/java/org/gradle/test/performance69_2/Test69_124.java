package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_124 {
    private final Production69_124 production = new Production69_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}