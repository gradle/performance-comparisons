package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_227 {
    private final Production67_227 production = new Production67_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}