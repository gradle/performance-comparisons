package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_8 {
    private final Production35_8 production = new Production35_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}