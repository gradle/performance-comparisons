package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_490 {
    private final Production67_490 production = new Production67_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}