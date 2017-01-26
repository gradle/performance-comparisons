package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_480 {
    private final Production50_480 production = new Production50_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}