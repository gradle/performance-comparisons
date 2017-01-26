package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_290 {
    private final Production50_290 production = new Production50_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}