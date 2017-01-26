package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_194 {
    private final Production69_194 production = new Production69_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}