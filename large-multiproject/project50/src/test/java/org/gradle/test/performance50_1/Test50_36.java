package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_36 {
    private final Production50_36 production = new Production50_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}