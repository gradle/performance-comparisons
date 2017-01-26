package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_324 {
    private final Production80_324 production = new Production80_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}