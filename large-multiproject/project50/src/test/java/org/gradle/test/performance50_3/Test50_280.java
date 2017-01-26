package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_280 {
    private final Production50_280 production = new Production50_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}