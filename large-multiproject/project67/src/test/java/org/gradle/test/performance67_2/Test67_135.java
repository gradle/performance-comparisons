package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_135 {
    private final Production67_135 production = new Production67_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}