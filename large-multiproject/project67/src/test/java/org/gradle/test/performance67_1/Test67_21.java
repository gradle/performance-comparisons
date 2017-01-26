package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_21 {
    private final Production67_21 production = new Production67_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}