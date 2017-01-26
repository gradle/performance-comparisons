package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_302 {
    private final Production67_302 production = new Production67_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}