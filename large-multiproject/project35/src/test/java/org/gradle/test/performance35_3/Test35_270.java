package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_270 {
    private final Production35_270 production = new Production35_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}