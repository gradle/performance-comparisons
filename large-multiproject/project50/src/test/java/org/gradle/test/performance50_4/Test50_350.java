package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_350 {
    private final Production50_350 production = new Production50_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}