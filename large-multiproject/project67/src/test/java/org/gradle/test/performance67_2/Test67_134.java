package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_134 {
    private final Production67_134 production = new Production67_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}