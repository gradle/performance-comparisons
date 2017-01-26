package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_360 {
    private final Production67_360 production = new Production67_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}