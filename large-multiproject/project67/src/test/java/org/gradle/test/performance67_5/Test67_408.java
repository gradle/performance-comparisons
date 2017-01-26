package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_408 {
    private final Production67_408 production = new Production67_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}