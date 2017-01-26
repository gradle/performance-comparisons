package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_491 {
    private final Production69_491 production = new Production69_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}