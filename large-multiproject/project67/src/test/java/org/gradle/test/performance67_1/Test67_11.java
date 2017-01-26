package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_11 {
    private final Production67_11 production = new Production67_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}