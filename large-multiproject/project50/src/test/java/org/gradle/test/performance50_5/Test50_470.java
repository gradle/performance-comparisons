package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_470 {
    private final Production50_470 production = new Production50_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}