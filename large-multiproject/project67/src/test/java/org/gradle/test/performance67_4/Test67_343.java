package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_343 {
    private final Production67_343 production = new Production67_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}