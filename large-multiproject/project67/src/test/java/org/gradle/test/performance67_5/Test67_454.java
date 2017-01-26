package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_454 {
    private final Production67_454 production = new Production67_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}