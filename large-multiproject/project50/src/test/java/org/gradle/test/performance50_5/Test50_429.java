package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_429 {
    private final Production50_429 production = new Production50_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}