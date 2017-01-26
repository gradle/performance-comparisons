package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_429 {
    private final Production69_429 production = new Production69_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}