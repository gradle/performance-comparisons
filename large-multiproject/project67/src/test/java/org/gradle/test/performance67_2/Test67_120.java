package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_120 {
    private final Production67_120 production = new Production67_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}