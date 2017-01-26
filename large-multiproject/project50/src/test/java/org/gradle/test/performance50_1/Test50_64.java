package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_64 {
    private final Production50_64 production = new Production50_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}