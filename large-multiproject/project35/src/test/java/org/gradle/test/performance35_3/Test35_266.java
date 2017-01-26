package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_266 {
    private final Production35_266 production = new Production35_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}