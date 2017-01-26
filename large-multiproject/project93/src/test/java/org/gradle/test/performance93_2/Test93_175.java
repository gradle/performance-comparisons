package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_175 {
    private final Production93_175 production = new Production93_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}