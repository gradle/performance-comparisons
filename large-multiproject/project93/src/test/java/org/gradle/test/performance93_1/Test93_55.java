package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_55 {
    private final Production93_55 production = new Production93_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}