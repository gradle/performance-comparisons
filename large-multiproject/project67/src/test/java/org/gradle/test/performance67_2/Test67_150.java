package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_150 {
    private final Production67_150 production = new Production67_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}