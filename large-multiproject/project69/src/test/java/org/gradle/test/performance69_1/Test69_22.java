package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_22 {
    private final Production69_22 production = new Production69_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}