package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_298 {
    private final Production67_298 production = new Production67_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}