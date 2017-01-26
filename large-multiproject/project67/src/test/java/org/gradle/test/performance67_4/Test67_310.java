package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_310 {
    private final Production67_310 production = new Production67_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}