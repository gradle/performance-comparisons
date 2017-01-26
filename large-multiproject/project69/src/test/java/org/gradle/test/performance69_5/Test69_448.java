package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_448 {
    private final Production69_448 production = new Production69_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}