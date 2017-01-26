package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_303 {
    private final Production67_303 production = new Production67_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}