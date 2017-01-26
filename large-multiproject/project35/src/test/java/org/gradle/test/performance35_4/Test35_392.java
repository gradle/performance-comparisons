package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_392 {
    private final Production35_392 production = new Production35_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}