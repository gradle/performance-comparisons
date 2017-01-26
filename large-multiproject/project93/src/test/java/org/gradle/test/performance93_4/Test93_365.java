package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_365 {
    private final Production93_365 production = new Production93_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}