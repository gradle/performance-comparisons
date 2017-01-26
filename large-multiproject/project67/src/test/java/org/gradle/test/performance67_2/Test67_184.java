package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_184 {
    private final Production67_184 production = new Production67_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}