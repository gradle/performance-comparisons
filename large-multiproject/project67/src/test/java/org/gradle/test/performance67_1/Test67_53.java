package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_53 {
    private final Production67_53 production = new Production67_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}