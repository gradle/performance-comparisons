package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_374 {
    private final Production67_374 production = new Production67_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}