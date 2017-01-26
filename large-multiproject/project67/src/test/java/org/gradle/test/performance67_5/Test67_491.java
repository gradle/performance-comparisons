package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_491 {
    private final Production67_491 production = new Production67_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}