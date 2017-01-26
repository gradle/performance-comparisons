package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_237 {
    private final Production67_237 production = new Production67_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}