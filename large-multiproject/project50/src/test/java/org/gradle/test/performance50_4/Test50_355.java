package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_355 {
    private final Production50_355 production = new Production50_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}