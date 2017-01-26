package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_387 {
    private final Production67_387 production = new Production67_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}