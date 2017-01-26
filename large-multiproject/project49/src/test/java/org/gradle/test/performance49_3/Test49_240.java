package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_240 {
    private final Production49_240 production = new Production49_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}