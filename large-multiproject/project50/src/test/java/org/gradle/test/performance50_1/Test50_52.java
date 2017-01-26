package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_52 {
    private final Production50_52 production = new Production50_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}