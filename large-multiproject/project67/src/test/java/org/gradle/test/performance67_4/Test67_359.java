package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_359 {
    private final Production67_359 production = new Production67_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}