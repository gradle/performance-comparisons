package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_171 {
    private final Production93_171 production = new Production93_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}