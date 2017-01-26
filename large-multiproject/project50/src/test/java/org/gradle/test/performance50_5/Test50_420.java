package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_420 {
    private final Production50_420 production = new Production50_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}