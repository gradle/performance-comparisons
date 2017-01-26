package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_197 {
    private final Production67_197 production = new Production67_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}