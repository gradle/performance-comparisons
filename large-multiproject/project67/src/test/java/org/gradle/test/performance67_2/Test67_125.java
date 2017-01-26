package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_125 {
    private final Production67_125 production = new Production67_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}