package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_405 {
    private final Production50_405 production = new Production50_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}