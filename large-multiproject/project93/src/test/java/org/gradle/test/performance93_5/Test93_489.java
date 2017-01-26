package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_489 {
    private final Production93_489 production = new Production93_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}