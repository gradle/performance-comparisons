package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_283 {
    private final Production50_283 production = new Production50_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}