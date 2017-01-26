package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_31 {
    private final Production67_31 production = new Production67_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}