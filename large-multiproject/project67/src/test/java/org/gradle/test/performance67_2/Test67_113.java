package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_113 {
    private final Production67_113 production = new Production67_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}