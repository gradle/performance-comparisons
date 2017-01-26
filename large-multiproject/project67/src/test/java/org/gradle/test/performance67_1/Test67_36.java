package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_36 {
    private final Production67_36 production = new Production67_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}