package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_233 {
    private final Production67_233 production = new Production67_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}