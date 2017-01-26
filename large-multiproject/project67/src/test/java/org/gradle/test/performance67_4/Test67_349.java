package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_349 {
    private final Production67_349 production = new Production67_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}