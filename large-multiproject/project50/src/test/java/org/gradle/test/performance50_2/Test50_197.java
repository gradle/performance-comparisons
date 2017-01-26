package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_197 {
    private final Production50_197 production = new Production50_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}