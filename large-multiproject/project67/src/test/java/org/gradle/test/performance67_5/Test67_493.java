package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_493 {
    private final Production67_493 production = new Production67_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}