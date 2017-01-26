package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_19 {
    private final Production93_19 production = new Production93_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}