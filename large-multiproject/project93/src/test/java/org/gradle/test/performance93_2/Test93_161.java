package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_161 {
    private final Production93_161 production = new Production93_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}