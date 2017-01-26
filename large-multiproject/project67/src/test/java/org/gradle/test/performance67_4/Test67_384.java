package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_384 {
    private final Production67_384 production = new Production67_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}