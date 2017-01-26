package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_86 {
    private final Production67_86 production = new Production67_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}