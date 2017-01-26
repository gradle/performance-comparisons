package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_486 {
    private final Production50_486 production = new Production50_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}