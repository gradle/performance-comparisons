package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_402 {
    private final Production69_402 production = new Production69_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}