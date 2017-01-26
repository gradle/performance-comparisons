package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_10 {
    private final Production35_10 production = new Production35_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}