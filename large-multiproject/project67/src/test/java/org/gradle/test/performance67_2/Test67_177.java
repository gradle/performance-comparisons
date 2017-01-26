package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_177 {
    private final Production67_177 production = new Production67_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}