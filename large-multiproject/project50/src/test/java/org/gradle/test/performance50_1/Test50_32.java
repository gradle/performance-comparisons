package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_32 {
    private final Production50_32 production = new Production50_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}