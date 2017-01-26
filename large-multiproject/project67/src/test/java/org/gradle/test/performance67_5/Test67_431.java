package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_431 {
    private final Production67_431 production = new Production67_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}