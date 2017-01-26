package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_367 {
    private final Production67_367 production = new Production67_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}