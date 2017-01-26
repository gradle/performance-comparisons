package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_455 {
    private final Production67_455 production = new Production67_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}