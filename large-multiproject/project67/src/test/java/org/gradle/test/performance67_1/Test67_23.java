package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_23 {
    private final Production67_23 production = new Production67_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}