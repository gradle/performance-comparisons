package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_401 {
    private final Production93_401 production = new Production93_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}