package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_161 {
    private final Production67_161 production = new Production67_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}