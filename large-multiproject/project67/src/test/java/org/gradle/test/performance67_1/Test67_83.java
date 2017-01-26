package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_83 {
    private final Production67_83 production = new Production67_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}