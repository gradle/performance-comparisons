package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_272 {
    private final Production67_272 production = new Production67_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}