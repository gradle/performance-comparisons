package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_244 {
    private final Production50_244 production = new Production50_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}