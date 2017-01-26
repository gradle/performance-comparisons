package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_203 {
    private final Production67_203 production = new Production67_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}