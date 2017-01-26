package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_217 {
    private final Production67_217 production = new Production67_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}