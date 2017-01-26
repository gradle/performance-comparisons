package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_350 {
    private final Production67_350 production = new Production67_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}