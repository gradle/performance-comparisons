package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_365 {
    private final Production67_365 production = new Production67_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}