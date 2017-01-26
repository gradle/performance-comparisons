package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_113 {
    private final Production93_113 production = new Production93_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}