package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_355 {
    private final Production69_355 production = new Production69_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}