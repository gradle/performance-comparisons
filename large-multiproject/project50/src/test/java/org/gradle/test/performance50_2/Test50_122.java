package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_122 {
    private final Production50_122 production = new Production50_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}