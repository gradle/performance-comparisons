package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_265 {
    private final Production50_265 production = new Production50_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}