package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_149 {
    private final Production67_149 production = new Production67_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}