package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_239 {
    private final Production50_239 production = new Production50_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}