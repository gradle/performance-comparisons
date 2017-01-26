package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_421 {
    private final Production50_421 production = new Production50_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}