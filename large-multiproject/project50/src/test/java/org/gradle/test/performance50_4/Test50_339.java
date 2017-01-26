package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_339 {
    private final Production50_339 production = new Production50_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}