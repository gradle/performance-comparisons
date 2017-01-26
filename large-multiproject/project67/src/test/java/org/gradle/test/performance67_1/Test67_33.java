package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_33 {
    private final Production67_33 production = new Production67_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}