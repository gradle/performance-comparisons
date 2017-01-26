package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_115 {
    private final Production67_115 production = new Production67_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}