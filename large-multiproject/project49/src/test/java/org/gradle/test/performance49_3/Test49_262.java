package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_262 {
    private final Production49_262 production = new Production49_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}