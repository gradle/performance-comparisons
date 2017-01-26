package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_471 {
    private final Production67_471 production = new Production67_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}