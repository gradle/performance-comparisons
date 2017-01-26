package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_204 {
    private final Production50_204 production = new Production50_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}