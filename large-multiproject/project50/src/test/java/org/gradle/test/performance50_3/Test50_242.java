package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_242 {
    private final Production50_242 production = new Production50_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}