package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_143 {
    private final Production50_143 production = new Production50_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}