package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_57 {
    private final Production67_57 production = new Production67_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}