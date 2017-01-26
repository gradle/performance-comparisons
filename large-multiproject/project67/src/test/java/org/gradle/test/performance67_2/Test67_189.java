package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_189 {
    private final Production67_189 production = new Production67_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}