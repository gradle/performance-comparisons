package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_340 {
    private final Production67_340 production = new Production67_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}