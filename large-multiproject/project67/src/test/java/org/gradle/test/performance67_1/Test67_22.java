package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_22 {
    private final Production67_22 production = new Production67_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}