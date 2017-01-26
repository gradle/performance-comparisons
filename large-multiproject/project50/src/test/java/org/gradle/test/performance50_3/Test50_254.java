package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_254 {
    private final Production50_254 production = new Production50_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}