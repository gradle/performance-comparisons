package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_278 {
    private final Production50_278 production = new Production50_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}