package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_35 {
    private final Production67_35 production = new Production67_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}