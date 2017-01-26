package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_319 {
    private final Production67_319 production = new Production67_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}