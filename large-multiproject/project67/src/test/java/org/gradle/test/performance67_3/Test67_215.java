package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_215 {
    private final Production67_215 production = new Production67_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}