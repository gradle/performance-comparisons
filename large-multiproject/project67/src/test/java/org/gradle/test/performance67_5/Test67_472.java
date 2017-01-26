package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_472 {
    private final Production67_472 production = new Production67_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}