package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_160 {
    private final Production69_160 production = new Production69_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}