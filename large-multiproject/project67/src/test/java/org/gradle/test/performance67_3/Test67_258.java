package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_258 {
    private final Production67_258 production = new Production67_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}