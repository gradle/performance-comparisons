package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_130 {
    private final Production67_130 production = new Production67_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}