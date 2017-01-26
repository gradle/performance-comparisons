package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_368 {
    private final Production69_368 production = new Production69_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}