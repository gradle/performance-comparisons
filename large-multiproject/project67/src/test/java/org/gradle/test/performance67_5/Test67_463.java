package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_463 {
    private final Production67_463 production = new Production67_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}