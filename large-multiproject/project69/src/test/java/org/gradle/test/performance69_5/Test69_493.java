package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_493 {
    private final Production69_493 production = new Production69_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}