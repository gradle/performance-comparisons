package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_131 {
    private final Production67_131 production = new Production67_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}