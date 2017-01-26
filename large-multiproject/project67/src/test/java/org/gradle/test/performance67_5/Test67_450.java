package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_450 {
    private final Production67_450 production = new Production67_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}