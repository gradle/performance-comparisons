package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_344 {
    private final Production69_344 production = new Production69_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}