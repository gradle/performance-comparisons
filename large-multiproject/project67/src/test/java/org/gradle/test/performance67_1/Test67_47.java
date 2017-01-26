package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_47 {
    private final Production67_47 production = new Production67_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}