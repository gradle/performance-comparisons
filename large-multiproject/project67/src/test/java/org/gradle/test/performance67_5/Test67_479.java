package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_479 {
    private final Production67_479 production = new Production67_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}