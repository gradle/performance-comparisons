package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_464 {
    private final Production50_464 production = new Production50_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}