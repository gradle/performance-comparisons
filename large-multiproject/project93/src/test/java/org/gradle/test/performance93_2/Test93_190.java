package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_190 {
    private final Production93_190 production = new Production93_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}