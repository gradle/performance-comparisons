package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_245 {
    private final Production60_245 production = new Production60_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}