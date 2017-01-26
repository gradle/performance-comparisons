package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_142 {
    private final Production50_142 production = new Production50_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}