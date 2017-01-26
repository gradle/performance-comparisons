package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_127 {
    private final Production67_127 production = new Production67_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}