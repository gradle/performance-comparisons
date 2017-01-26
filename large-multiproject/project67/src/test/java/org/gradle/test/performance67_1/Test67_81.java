package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_81 {
    private final Production67_81 production = new Production67_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}