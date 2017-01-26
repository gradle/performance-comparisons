package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_396 {
    private final Production67_396 production = new Production67_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}