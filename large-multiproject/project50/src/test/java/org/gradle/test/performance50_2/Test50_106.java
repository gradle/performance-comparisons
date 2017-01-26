package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_106 {
    private final Production50_106 production = new Production50_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}