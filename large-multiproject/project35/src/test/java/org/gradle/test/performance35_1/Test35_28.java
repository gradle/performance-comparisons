package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_28 {
    private final Production35_28 production = new Production35_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}