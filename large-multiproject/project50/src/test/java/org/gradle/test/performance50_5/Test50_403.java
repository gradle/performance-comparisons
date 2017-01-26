package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_403 {
    private final Production50_403 production = new Production50_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}