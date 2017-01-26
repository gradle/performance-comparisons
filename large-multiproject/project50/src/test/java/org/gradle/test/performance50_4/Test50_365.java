package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_365 {
    private final Production50_365 production = new Production50_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}