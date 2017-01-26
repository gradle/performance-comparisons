package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_335 {
    private final Production69_335 production = new Production69_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}