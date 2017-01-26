package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_317 {
    private final Production67_317 production = new Production67_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}