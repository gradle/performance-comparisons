package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_131 {
    private final Production93_131 production = new Production93_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}