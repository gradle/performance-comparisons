package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_318 {
    private final Production50_318 production = new Production50_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}