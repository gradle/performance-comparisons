package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_327 {
    private final Production69_327 production = new Production69_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}