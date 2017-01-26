package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_477 {
    private final Production67_477 production = new Production67_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}