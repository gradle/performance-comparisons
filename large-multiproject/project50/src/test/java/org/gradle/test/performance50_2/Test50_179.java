package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_179 {
    private final Production50_179 production = new Production50_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}