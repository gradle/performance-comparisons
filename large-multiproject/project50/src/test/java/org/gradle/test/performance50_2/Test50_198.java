package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_198 {
    private final Production50_198 production = new Production50_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}