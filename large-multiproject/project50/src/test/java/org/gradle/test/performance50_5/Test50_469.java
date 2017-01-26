package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_469 {
    private final Production50_469 production = new Production50_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}