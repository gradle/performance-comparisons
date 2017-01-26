package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_208 {
    private final Production67_208 production = new Production67_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}