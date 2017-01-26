package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_281 {
    private final Production35_281 production = new Production35_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}