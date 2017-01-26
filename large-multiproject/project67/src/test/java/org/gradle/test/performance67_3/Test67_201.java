package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_201 {
    private final Production67_201 production = new Production67_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}