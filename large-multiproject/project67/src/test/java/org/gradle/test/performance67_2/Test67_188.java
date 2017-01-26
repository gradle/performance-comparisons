package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_188 {
    private final Production67_188 production = new Production67_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}