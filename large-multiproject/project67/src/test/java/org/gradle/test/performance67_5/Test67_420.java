package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_420 {
    private final Production67_420 production = new Production67_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}