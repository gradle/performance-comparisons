package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_239 {
    private final Production93_239 production = new Production93_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}