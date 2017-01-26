package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_200 {
    private final Production67_200 production = new Production67_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}