package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_142 {
    private final Production67_142 production = new Production67_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}