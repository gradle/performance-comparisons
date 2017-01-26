package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_398 {
    private final Production50_398 production = new Production50_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}