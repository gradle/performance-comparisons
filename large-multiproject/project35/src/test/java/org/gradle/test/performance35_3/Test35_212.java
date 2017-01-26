package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_212 {
    private final Production35_212 production = new Production35_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}