package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_208 {
    private final Production50_208 production = new Production50_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}