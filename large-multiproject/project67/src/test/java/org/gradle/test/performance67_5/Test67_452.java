package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_452 {
    private final Production67_452 production = new Production67_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}