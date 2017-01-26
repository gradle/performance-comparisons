package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_451 {
    private final Production67_451 production = new Production67_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}