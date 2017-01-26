package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_170 {
    private final Production67_170 production = new Production67_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}