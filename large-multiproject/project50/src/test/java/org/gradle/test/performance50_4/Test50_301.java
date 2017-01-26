package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_301 {
    private final Production50_301 production = new Production50_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}