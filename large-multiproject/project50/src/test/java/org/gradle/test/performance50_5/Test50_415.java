package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_415 {
    private final Production50_415 production = new Production50_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}