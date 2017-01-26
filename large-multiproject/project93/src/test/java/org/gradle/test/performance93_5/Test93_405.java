package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_405 {
    private final Production93_405 production = new Production93_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}