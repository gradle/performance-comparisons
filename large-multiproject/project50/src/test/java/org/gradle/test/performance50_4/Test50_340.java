package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_340 {
    private final Production50_340 production = new Production50_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}