package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_206 {
    private final Production67_206 production = new Production67_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}