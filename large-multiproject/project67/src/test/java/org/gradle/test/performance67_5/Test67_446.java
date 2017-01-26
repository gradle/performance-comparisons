package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_446 {
    private final Production67_446 production = new Production67_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}