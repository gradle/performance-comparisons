package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_459 {
    private final Production50_459 production = new Production50_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}