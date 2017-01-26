package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_309 {
    private final Production67_309 production = new Production67_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}