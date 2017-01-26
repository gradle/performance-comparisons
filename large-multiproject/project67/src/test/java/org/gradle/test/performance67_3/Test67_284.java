package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_284 {
    private final Production67_284 production = new Production67_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}