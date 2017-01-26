package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_141 {
    private final Production67_141 production = new Production67_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}