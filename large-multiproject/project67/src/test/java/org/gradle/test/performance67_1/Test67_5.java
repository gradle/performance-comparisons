package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_5 {
    private final Production67_5 production = new Production67_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}