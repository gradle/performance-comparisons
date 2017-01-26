package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_438 {
    private final Production7_438 production = new Production7_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}