package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_313 {
    private final Production67_313 production = new Production67_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}