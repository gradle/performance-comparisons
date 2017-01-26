package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_364 {
    private final Production35_364 production = new Production35_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}