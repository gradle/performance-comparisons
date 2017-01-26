package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_383 {
    private final Production67_383 production = new Production67_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}