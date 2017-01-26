package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_181 {
    private final Production67_181 production = new Production67_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}