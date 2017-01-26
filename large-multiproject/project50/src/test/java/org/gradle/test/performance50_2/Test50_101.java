package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_101 {
    private final Production50_101 production = new Production50_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}