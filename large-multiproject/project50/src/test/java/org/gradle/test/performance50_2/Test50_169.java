package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_169 {
    private final Production50_169 production = new Production50_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}