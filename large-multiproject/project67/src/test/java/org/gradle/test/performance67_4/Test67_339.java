package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_339 {
    private final Production67_339 production = new Production67_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}