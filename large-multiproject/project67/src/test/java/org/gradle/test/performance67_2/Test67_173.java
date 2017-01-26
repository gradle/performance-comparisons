package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_173 {
    private final Production67_173 production = new Production67_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}