package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_472 {
    private final Production50_472 production = new Production50_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}