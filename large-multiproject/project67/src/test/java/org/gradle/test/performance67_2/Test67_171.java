package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_171 {
    private final Production67_171 production = new Production67_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}