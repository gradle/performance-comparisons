package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_192 {
    private final Production67_192 production = new Production67_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}