package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_381 {
    private final Production67_381 production = new Production67_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}