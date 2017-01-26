package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_308 {
    private final Production67_308 production = new Production67_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}