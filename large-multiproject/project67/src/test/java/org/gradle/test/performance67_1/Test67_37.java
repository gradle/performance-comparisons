package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_37 {
    private final Production67_37 production = new Production67_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}