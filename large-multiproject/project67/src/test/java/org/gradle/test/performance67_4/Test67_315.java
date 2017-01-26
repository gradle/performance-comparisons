package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_315 {
    private final Production67_315 production = new Production67_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}