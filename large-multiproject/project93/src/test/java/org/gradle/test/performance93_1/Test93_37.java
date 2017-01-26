package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_37 {
    private final Production93_37 production = new Production93_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}