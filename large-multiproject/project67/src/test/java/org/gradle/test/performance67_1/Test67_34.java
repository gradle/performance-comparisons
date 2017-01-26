package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_34 {
    private final Production67_34 production = new Production67_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}