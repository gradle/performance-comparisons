package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_12 {
    private final Production50_12 production = new Production50_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}