package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_140 {
    private final Production67_140 production = new Production67_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}