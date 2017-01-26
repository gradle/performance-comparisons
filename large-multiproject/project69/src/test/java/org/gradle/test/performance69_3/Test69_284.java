package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_284 {
    private final Production69_284 production = new Production69_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}