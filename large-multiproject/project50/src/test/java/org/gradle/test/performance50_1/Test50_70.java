package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_70 {
    private final Production50_70 production = new Production50_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}