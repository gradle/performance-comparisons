package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_139 {
    private final Production67_139 production = new Production67_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}