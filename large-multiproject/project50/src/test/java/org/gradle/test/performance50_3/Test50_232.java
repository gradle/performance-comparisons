package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_232 {
    private final Production50_232 production = new Production50_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}