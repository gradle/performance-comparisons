package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_299 {
    private final Production69_299 production = new Production69_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}