package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_354 {
    private final Production50_354 production = new Production50_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}