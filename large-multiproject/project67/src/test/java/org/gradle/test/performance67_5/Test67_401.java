package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_401 {
    private final Production67_401 production = new Production67_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}