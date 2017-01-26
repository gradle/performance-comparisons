package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_228 {
    private final Production67_228 production = new Production67_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}