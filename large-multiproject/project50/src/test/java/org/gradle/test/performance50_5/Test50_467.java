package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_467 {
    private final Production50_467 production = new Production50_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}