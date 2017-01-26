package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_94 {
    private final Production67_94 production = new Production67_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}