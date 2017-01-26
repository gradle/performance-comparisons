package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_272 {
    private final Production69_272 production = new Production69_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}