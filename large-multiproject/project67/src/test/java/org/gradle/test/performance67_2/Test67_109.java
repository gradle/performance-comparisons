package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_109 {
    private final Production67_109 production = new Production67_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}