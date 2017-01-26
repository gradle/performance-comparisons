package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_423 {
    private final Production93_423 production = new Production93_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}