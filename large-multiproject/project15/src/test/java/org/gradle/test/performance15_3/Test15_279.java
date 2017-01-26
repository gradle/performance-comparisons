package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_279 {
    private final Production15_279 production = new Production15_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}