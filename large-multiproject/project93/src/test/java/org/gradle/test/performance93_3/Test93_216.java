package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_216 {
    private final Production93_216 production = new Production93_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}