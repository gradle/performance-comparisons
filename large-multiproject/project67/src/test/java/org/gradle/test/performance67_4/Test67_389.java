package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_389 {
    private final Production67_389 production = new Production67_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}