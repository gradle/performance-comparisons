package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_191 {
    private final Production50_191 production = new Production50_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}