package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_385 {
    private final Production69_385 production = new Production69_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}