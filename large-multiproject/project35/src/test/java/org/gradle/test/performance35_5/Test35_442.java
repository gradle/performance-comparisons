package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_442 {
    private final Production35_442 production = new Production35_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}