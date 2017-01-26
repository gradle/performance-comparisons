package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_270 {
    private final Production67_270 production = new Production67_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}