package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_190 {
    private final Production67_190 production = new Production67_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}