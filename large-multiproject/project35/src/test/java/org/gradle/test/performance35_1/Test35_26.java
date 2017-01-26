package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_26 {
    private final Production35_26 production = new Production35_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}