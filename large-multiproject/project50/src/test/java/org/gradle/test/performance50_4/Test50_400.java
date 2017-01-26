package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_400 {
    private final Production50_400 production = new Production50_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}