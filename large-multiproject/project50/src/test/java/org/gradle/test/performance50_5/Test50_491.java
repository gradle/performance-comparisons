package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_491 {
    private final Production50_491 production = new Production50_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}