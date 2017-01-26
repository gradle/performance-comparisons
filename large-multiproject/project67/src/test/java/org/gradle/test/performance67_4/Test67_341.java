package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_341 {
    private final Production67_341 production = new Production67_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}