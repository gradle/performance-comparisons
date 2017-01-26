package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_103 {
    private final Production50_103 production = new Production50_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}