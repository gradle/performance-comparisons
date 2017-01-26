package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_349 {
    private final Production50_349 production = new Production50_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}