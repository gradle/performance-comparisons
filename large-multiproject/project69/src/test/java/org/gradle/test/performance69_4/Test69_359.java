package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_359 {
    private final Production69_359 production = new Production69_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}