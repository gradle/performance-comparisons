package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_26 {
    private final Production67_26 production = new Production67_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}