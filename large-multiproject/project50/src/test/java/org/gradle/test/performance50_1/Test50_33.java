package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_33 {
    private final Production50_33 production = new Production50_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}