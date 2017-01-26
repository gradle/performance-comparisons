package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_247 {
    private final Production93_247 production = new Production93_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}