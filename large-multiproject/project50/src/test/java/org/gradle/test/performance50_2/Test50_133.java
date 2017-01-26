package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_133 {
    private final Production50_133 production = new Production50_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}