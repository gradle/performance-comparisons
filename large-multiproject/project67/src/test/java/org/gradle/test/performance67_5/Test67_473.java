package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_473 {
    private final Production67_473 production = new Production67_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}