package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_307 {
    private final Production67_307 production = new Production67_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}