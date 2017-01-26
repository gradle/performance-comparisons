package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_499 {
    private final Production67_499 production = new Production67_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}