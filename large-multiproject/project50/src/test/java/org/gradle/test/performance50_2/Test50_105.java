package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_105 {
    private final Production50_105 production = new Production50_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}