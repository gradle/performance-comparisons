package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_11 {
    private final Production69_11 production = new Production69_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}