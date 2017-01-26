package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_220 {
    private final Production67_220 production = new Production67_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}