package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_381 {
    private final Production50_381 production = new Production50_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}