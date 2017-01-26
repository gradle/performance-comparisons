package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_81 {
    private final Production50_81 production = new Production50_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}