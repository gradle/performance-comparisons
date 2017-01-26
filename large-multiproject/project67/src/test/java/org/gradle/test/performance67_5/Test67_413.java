package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_413 {
    private final Production67_413 production = new Production67_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}