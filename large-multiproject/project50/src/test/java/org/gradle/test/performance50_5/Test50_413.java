package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_413 {
    private final Production50_413 production = new Production50_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}