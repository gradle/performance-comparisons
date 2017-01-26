package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_104 {
    private final Production67_104 production = new Production67_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}