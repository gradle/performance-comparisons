package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_422 {
    private final Production67_422 production = new Production67_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}