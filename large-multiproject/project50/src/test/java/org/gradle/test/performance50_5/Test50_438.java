package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_438 {
    private final Production50_438 production = new Production50_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}