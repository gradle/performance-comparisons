package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_213 {
    private final Production93_213 production = new Production93_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}