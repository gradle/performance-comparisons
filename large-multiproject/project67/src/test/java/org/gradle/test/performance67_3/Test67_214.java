package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_214 {
    private final Production67_214 production = new Production67_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}