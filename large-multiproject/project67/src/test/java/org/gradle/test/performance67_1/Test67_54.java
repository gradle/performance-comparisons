package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_54 {
    private final Production67_54 production = new Production67_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}