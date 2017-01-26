package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_435 {
    private final Production93_435 production = new Production93_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}