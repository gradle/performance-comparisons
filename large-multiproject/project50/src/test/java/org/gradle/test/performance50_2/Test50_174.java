package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_174 {
    private final Production50_174 production = new Production50_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}