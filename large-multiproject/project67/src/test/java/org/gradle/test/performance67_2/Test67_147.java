package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_147 {
    private final Production67_147 production = new Production67_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}