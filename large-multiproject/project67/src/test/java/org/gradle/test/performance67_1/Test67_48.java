package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_48 {
    private final Production67_48 production = new Production67_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}