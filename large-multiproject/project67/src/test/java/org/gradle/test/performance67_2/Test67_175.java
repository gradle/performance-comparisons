package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_175 {
    private final Production67_175 production = new Production67_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}