package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_129 {
    private final Production50_129 production = new Production50_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}