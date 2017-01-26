package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_118 {
    private final Production67_118 production = new Production67_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}