package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_253 {
    private final Production67_253 production = new Production67_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}