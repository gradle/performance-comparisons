package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_402 {
    private final Production67_402 production = new Production67_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}