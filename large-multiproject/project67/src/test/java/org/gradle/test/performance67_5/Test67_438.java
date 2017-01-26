package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_438 {
    private final Production67_438 production = new Production67_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}