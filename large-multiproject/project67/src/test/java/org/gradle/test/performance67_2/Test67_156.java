package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_156 {
    private final Production67_156 production = new Production67_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}