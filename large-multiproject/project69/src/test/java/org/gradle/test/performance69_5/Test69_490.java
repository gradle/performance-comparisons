package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_490 {
    private final Production69_490 production = new Production69_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}