package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_165 {
    private final Production93_165 production = new Production93_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}