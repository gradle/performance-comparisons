package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_5 {
    private final Production93_5 production = new Production93_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}