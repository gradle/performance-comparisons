package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_241 {
    private final Production35_241 production = new Production35_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}