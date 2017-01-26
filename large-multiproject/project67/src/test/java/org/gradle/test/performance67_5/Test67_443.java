package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_443 {
    private final Production67_443 production = new Production67_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}