package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_342 {
    private final Production67_342 production = new Production67_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}