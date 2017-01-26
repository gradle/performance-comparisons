package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_249 {
    private final Production67_249 production = new Production67_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}