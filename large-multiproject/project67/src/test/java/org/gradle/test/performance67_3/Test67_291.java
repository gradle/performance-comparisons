package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_291 {
    private final Production67_291 production = new Production67_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}