package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_190 {
    private final Production50_190 production = new Production50_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}