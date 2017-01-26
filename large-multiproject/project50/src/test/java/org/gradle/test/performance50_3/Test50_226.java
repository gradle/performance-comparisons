package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_226 {
    private final Production50_226 production = new Production50_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}