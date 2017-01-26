package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_352 {
    private final Production67_352 production = new Production67_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}