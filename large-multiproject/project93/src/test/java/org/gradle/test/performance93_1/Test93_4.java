package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_4 {
    private final Production93_4 production = new Production93_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}