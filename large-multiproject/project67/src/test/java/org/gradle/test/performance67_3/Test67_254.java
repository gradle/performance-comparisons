package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_254 {
    private final Production67_254 production = new Production67_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}