package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_244 {
    private final Production67_244 production = new Production67_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}