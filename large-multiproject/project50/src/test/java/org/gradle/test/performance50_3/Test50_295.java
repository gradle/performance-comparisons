package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_295 {
    private final Production50_295 production = new Production50_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}