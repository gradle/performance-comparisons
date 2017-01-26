package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_245 {
    private final Production49_245 production = new Production49_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}