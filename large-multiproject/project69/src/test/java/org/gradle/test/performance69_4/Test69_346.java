package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_346 {
    private final Production69_346 production = new Production69_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}