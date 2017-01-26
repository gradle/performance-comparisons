package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_484 {
    private final Production50_484 production = new Production50_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}