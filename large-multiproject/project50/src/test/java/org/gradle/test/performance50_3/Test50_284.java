package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_284 {
    private final Production50_284 production = new Production50_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}