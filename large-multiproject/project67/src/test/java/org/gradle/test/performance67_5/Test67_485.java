package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_485 {
    private final Production67_485 production = new Production67_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}