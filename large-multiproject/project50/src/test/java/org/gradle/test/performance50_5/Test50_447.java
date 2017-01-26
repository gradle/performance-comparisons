package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_447 {
    private final Production50_447 production = new Production50_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}