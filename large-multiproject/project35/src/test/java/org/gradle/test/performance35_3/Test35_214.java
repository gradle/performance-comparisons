package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_214 {
    private final Production35_214 production = new Production35_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}