package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_87 {
    private final Production67_87 production = new Production67_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}