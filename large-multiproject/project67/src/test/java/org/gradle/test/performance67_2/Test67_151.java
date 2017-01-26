package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_151 {
    private final Production67_151 production = new Production67_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}