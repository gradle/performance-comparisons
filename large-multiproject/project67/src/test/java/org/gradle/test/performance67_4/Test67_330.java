package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_330 {
    private final Production67_330 production = new Production67_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}