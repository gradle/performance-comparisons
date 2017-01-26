package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_258 {
    private final Production50_258 production = new Production50_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}