package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_458 {
    private final Production35_458 production = new Production35_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}