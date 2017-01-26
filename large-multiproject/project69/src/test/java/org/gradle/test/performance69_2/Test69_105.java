package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_105 {
    private final Production69_105 production = new Production69_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}