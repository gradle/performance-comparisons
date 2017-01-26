package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_176 {
    private final Production50_176 production = new Production50_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}