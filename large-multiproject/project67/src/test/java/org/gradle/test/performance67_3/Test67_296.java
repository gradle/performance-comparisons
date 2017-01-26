package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_296 {
    private final Production67_296 production = new Production67_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}