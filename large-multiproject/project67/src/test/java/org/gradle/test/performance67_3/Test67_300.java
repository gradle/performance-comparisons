package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_300 {
    private final Production67_300 production = new Production67_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}