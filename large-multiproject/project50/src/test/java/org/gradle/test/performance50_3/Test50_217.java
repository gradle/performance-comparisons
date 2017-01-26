package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_217 {
    private final Production50_217 production = new Production50_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}