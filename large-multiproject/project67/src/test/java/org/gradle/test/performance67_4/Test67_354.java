package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_354 {
    private final Production67_354 production = new Production67_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}