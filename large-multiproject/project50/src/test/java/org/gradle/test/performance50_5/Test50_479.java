package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_479 {
    private final Production50_479 production = new Production50_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}