package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_327 {
    private final Production67_327 production = new Production67_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}