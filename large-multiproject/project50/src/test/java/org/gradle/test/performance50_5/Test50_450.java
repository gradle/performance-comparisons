package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_450 {
    private final Production50_450 production = new Production50_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}