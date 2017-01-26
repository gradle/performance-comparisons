package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_59 {
    private final Production35_59 production = new Production35_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}