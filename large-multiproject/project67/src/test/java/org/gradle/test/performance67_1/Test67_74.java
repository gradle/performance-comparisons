package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_74 {
    private final Production67_74 production = new Production67_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}