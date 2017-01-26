package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_203 {
    private final Production93_203 production = new Production93_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}