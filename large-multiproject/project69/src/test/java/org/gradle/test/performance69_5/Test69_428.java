package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_428 {
    private final Production69_428 production = new Production69_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}