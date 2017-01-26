package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_15 {
    private final Production67_15 production = new Production67_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}