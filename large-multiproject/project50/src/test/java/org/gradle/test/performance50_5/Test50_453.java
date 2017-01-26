package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_453 {
    private final Production50_453 production = new Production50_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}