package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_482 {
    private final Production67_482 production = new Production67_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}