package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_199 {
    private final Production67_199 production = new Production67_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}