package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_264 {
    private final Production67_264 production = new Production67_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}