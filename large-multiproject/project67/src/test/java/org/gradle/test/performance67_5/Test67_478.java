package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_478 {
    private final Production67_478 production = new Production67_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}