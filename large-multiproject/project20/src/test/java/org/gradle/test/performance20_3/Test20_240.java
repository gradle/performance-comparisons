package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_240 {
    private final Production20_240 production = new Production20_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}