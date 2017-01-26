package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_304 {
    private final Production67_304 production = new Production67_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}