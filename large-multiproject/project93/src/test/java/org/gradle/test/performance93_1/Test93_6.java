package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_6 {
    private final Production93_6 production = new Production93_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}