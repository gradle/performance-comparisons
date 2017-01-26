package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_162 {
    private final Production67_162 production = new Production67_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}