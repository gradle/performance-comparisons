package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_373 {
    private final Production35_373 production = new Production35_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}