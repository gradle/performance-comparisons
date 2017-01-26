package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_397 {
    private final Production67_397 production = new Production67_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}