package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_230 {
    private final Production67_230 production = new Production67_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}