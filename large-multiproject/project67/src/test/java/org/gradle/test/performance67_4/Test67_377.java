package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_377 {
    private final Production67_377 production = new Production67_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}