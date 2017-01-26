package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_273 {
    private final Production50_273 production = new Production50_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}