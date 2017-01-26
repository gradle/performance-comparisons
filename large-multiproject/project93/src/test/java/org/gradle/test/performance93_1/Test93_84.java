package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_84 {
    private final Production93_84 production = new Production93_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}