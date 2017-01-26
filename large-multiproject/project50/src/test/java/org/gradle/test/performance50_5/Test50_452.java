package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_452 {
    private final Production50_452 production = new Production50_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}