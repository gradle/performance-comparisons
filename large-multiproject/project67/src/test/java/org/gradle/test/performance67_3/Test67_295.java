package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_295 {
    private final Production67_295 production = new Production67_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}