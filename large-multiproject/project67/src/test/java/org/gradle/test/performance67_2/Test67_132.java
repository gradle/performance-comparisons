package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_132 {
    private final Production67_132 production = new Production67_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}