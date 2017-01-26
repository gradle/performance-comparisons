package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_28 {
    private final Production67_28 production = new Production67_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}