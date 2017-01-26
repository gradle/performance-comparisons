package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_245 {
    private final Production67_245 production = new Production67_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}