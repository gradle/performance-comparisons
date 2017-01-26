package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_376 {
    private final Production69_376 production = new Production69_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}