package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_443 {
    private final Production69_443 production = new Production69_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}