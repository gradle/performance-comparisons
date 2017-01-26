package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_113 {
    private final Production50_113 production = new Production50_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}