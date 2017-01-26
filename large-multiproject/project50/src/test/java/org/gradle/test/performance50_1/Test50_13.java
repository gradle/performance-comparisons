package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_13 {
    private final Production50_13 production = new Production50_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}