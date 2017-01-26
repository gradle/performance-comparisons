package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_489 {
    private final Production67_489 production = new Production67_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}