package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_447 {
    private final Production67_447 production = new Production67_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}