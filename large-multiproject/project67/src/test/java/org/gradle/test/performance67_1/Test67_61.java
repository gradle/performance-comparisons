package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_61 {
    private final Production67_61 production = new Production67_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}