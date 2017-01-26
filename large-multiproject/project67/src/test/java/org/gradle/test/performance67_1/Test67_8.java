package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_8 {
    private final Production67_8 production = new Production67_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}