package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_124 {
    private final Production67_124 production = new Production67_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}