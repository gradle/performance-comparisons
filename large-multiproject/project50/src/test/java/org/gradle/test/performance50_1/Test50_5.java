package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_5 {
    private final Production50_5 production = new Production50_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}