package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_115 {
    private final Production50_115 production = new Production50_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}