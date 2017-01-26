package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_206 {
    private final Production50_206 production = new Production50_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}