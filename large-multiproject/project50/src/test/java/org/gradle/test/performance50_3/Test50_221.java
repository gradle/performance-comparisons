package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_221 {
    private final Production50_221 production = new Production50_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}