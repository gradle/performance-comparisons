package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_136 {
    private final Production67_136 production = new Production67_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}