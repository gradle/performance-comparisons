package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_79 {
    private final Production67_79 production = new Production67_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}