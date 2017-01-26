package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_173 {
    private final Production50_173 production = new Production50_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}