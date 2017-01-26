package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_410 {
    private final Production50_410 production = new Production50_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}