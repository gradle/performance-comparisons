package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_324 {
    private final Production31_324 production = new Production31_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}