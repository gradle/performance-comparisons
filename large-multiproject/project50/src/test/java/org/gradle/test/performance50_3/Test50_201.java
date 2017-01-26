package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_201 {
    private final Production50_201 production = new Production50_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}