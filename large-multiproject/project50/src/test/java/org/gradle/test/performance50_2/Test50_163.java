package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_163 {
    private final Production50_163 production = new Production50_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}