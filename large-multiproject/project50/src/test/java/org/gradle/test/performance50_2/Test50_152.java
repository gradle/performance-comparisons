package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_152 {
    private final Production50_152 production = new Production50_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}