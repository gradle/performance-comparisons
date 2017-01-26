package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_368 {
    private final Production50_368 production = new Production50_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}