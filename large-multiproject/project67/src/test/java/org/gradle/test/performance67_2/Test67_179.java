package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_179 {
    private final Production67_179 production = new Production67_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}