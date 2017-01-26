package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_446 {
    private final Production50_446 production = new Production50_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}