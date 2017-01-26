package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_459 {
    private final Production67_459 production = new Production67_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}