package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_24 {
    private final Production67_24 production = new Production67_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}