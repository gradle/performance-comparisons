package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_32 {
    private final Production67_32 production = new Production67_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}