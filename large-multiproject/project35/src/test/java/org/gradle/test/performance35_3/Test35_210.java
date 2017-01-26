package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_210 {
    private final Production35_210 production = new Production35_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}