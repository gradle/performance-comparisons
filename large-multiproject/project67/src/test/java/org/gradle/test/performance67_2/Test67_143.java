package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_143 {
    private final Production67_143 production = new Production67_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}