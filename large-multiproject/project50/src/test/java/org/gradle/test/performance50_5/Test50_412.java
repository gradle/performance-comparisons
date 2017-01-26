package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_412 {
    private final Production50_412 production = new Production50_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}