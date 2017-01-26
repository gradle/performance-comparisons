package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_24 {
    private final Production50_24 production = new Production50_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}