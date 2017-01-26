package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_96 {
    private final Production35_96 production = new Production35_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}