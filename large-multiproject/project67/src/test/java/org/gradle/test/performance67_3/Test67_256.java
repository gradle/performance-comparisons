package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_256 {
    private final Production67_256 production = new Production67_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}