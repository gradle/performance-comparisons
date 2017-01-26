package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_202 {
    private final Production67_202 production = new Production67_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}