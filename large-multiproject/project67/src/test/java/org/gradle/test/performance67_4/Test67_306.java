package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_306 {
    private final Production67_306 production = new Production67_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}