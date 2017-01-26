package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_6 {
    private final Production50_6 production = new Production50_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}