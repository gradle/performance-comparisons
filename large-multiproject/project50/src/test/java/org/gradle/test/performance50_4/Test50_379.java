package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_379 {
    private final Production50_379 production = new Production50_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}