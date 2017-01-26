package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_482 {
    private final Production93_482 production = new Production93_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}