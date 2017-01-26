package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_35 {
    private final Production35_35 production = new Production35_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}