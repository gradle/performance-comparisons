package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_170 {
    private final Production50_170 production = new Production50_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}