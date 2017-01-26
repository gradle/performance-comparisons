package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_464 {
    private final Production67_464 production = new Production67_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}