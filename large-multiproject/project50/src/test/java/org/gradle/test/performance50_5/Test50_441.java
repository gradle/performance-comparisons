package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_441 {
    private final Production50_441 production = new Production50_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}