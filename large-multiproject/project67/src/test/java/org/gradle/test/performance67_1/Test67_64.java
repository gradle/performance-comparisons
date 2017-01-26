package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_64 {
    private final Production67_64 production = new Production67_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}