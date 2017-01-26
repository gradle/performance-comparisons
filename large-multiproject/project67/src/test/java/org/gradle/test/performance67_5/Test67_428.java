package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_428 {
    private final Production67_428 production = new Production67_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}