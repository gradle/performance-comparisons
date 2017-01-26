package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_90 {
    private final Production67_90 production = new Production67_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}