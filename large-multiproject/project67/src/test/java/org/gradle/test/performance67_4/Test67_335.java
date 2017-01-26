package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_335 {
    private final Production67_335 production = new Production67_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}