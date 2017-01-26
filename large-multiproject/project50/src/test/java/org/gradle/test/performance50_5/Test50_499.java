package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_499 {
    private final Production50_499 production = new Production50_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}