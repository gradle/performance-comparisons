package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_70 {
    private final Production93_70 production = new Production93_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}