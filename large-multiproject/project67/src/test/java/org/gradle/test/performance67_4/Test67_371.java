package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_371 {
    private final Production67_371 production = new Production67_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}