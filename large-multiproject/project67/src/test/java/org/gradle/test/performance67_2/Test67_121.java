package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_121 {
    private final Production67_121 production = new Production67_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}