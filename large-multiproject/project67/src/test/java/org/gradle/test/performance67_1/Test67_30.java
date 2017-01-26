package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_30 {
    private final Production67_30 production = new Production67_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}