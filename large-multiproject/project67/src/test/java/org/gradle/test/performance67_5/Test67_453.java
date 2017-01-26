package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_453 {
    private final Production67_453 production = new Production67_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}