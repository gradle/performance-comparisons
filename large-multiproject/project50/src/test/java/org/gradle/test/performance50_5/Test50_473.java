package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_473 {
    private final Production50_473 production = new Production50_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}