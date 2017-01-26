package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_164 {
    private final Production67_164 production = new Production67_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}