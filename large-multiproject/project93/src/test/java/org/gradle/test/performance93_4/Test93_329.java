package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_329 {
    private final Production93_329 production = new Production93_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}