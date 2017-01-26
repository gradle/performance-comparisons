package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_106 {
    private final Production35_106 production = new Production35_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}