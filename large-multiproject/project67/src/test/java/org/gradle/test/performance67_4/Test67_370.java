package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_370 {
    private final Production67_370 production = new Production67_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}