package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_13 {
    private final Production67_13 production = new Production67_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}