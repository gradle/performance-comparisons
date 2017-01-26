package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_273 {
    private final Production67_273 production = new Production67_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}