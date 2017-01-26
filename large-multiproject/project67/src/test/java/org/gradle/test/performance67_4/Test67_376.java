package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_376 {
    private final Production67_376 production = new Production67_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}