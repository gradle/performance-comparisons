package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_321 {
    private final Production50_321 production = new Production50_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}