package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_222 {
    private final Production35_222 production = new Production35_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}