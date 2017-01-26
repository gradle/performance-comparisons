package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_488 {
    private final Production67_488 production = new Production67_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}