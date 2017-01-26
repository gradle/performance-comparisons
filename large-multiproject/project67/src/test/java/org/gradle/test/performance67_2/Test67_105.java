package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_105 {
    private final Production67_105 production = new Production67_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}