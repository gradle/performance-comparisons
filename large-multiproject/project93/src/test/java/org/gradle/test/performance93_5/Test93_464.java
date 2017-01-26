package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_464 {
    private final Production93_464 production = new Production93_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}