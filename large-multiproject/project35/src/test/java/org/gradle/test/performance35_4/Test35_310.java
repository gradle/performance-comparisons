package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_310 {
    private final Production35_310 production = new Production35_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}