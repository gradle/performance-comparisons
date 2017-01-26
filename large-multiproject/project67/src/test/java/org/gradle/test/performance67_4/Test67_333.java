package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_333 {
    private final Production67_333 production = new Production67_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}