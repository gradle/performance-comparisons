package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_361 {
    private final Production67_361 production = new Production67_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}