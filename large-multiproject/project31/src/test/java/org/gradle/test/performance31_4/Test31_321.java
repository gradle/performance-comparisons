package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_321 {
    private final Production31_321 production = new Production31_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}