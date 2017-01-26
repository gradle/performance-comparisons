package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_196 {
    private final Production67_196 production = new Production67_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}