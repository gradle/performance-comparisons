package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_431 {
    private final Production50_431 production = new Production50_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}