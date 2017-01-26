package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_368 {
    private final Production67_368 production = new Production67_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}