package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_131 {
    private final Production50_131 production = new Production50_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}