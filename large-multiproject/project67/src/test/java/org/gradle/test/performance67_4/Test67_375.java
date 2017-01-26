package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_375 {
    private final Production67_375 production = new Production67_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}