package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_409 {
    private final Production67_409 production = new Production67_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}