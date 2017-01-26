package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_20 {
    private final Production50_20 production = new Production50_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}