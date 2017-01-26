package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_423 {
    private final Production67_423 production = new Production67_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}