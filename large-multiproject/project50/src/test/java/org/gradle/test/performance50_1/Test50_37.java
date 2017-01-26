package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_37 {
    private final Production50_37 production = new Production50_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}