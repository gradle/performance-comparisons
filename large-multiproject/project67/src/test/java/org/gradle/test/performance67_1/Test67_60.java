package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_60 {
    private final Production67_60 production = new Production67_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}