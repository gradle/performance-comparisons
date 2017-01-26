package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_184 {
    private final Production50_184 production = new Production50_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}