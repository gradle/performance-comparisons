package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_23 {
    private final Production50_23 production = new Production50_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}