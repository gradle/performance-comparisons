package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_436 {
    private final Production50_436 production = new Production50_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}