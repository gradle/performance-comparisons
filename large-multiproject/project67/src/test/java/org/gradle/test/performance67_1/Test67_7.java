package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_7 {
    private final Production67_7 production = new Production67_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}