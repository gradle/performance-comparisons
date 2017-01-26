package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_4 {
    private final Production67_4 production = new Production67_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}