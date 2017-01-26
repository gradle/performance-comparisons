package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_310 {
    private final Production50_310 production = new Production50_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}