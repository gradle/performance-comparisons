package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_163 {
    private final Production67_163 production = new Production67_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}