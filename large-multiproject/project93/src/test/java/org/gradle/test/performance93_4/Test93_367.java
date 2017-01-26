package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_367 {
    private final Production93_367 production = new Production93_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}