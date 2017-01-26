package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_429 {
    private final Production67_429 production = new Production67_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}