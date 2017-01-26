package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_410 {
    private final Production69_410 production = new Production69_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}