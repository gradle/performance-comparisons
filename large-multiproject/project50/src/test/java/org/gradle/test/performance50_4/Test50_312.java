package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_312 {
    private final Production50_312 production = new Production50_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}