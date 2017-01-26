package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_55 {
    private final Production50_55 production = new Production50_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}