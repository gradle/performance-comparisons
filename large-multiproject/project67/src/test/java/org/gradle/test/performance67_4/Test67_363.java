package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_363 {
    private final Production67_363 production = new Production67_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}