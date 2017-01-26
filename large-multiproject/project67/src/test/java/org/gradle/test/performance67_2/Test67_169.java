package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_169 {
    private final Production67_169 production = new Production67_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}