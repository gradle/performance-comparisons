package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_336 {
    private final Production50_336 production = new Production50_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}