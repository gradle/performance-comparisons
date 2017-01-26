package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_398 {
    private final Production67_398 production = new Production67_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}