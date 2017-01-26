package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_322 {
    private final Production67_322 production = new Production67_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}