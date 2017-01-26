package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_334 {
    private final Production67_334 production = new Production67_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}