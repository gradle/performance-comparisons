package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_252 {
    private final Production50_252 production = new Production50_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}