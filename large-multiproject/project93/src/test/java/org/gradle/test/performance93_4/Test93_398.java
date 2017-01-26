package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_398 {
    private final Production93_398 production = new Production93_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}