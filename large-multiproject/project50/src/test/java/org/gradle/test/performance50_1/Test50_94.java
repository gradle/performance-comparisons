package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_94 {
    private final Production50_94 production = new Production50_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}