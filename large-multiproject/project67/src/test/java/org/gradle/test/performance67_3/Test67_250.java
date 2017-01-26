package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_250 {
    private final Production67_250 production = new Production67_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}