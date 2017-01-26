package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_5 {
    private final Production35_5 production = new Production35_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}