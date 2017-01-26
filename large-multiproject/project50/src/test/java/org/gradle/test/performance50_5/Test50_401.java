package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_401 {
    private final Production50_401 production = new Production50_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}