package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_443 {
    private final Production50_443 production = new Production50_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}