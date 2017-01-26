package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_211 {
    private final Production67_211 production = new Production67_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}