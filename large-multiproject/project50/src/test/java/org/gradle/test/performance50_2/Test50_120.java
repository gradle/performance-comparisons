package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_120 {
    private final Production50_120 production = new Production50_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}