package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_413 {
    private final Production69_413 production = new Production69_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}