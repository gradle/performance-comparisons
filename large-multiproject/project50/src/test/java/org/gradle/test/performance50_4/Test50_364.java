package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_364 {
    private final Production50_364 production = new Production50_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}