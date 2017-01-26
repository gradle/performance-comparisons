package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_226 {
    private final Production35_226 production = new Production35_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}