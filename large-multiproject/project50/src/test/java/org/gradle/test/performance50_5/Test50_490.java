package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_490 {
    private final Production50_490 production = new Production50_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}