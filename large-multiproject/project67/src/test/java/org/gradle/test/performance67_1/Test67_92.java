package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_92 {
    private final Production67_92 production = new Production67_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}