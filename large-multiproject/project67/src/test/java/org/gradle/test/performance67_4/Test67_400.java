package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_400 {
    private final Production67_400 production = new Production67_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}