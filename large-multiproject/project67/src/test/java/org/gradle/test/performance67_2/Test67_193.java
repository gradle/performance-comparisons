package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_193 {
    private final Production67_193 production = new Production67_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}