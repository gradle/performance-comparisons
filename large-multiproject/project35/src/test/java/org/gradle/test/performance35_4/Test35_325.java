package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_325 {
    private final Production35_325 production = new Production35_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}