package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_367 {
    private final Production50_367 production = new Production50_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}