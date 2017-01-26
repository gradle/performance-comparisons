package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_95 {
    private final Production50_95 production = new Production50_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}