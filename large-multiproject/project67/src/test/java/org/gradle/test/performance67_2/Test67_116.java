package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_116 {
    private final Production67_116 production = new Production67_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}