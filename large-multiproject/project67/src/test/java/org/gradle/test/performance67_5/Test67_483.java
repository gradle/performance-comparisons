package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_483 {
    private final Production67_483 production = new Production67_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}