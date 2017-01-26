package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_384 {
    private final Production50_384 production = new Production50_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}