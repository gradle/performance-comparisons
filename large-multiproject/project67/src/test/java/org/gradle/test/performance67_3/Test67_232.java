package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_232 {
    private final Production67_232 production = new Production67_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}