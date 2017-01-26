package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_18 {
    private final Production67_18 production = new Production67_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}