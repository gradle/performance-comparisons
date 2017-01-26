package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_6 {
    private final Production67_6 production = new Production67_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}