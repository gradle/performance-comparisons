package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_108 {
    private final Production50_108 production = new Production50_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}