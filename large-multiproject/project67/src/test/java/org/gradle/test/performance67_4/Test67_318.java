package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_318 {
    private final Production67_318 production = new Production67_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}