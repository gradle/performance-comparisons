package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_423 {
    private final Production50_423 production = new Production50_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}