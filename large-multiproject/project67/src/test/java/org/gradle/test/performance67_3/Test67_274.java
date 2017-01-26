package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_274 {
    private final Production67_274 production = new Production67_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}