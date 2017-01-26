package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_466 {
    private final Production67_466 production = new Production67_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}