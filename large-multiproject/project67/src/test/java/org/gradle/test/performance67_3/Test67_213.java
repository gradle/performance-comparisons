package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_213 {
    private final Production67_213 production = new Production67_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}