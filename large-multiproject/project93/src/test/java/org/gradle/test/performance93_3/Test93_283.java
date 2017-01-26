package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_283 {
    private final Production93_283 production = new Production93_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}