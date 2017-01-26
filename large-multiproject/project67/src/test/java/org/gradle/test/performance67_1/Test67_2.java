package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_2 {
    private final Production67_2 production = new Production67_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}