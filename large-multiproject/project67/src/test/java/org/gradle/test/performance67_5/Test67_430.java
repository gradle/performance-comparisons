package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_430 {
    private final Production67_430 production = new Production67_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}