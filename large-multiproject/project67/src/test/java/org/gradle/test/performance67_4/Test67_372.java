package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_372 {
    private final Production67_372 production = new Production67_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}