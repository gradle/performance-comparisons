package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_235 {
    private final Production67_235 production = new Production67_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}