package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_448 {
    private final Production67_448 production = new Production67_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}