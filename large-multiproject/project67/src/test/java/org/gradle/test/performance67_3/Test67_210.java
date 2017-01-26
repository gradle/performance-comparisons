package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_210 {
    private final Production67_210 production = new Production67_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}