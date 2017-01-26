package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_152 {
    private final Production67_152 production = new Production67_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}