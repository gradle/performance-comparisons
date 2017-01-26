package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_187 {
    private final Production67_187 production = new Production67_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}