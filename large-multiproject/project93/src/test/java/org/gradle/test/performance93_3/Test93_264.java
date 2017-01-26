package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_264 {
    private final Production93_264 production = new Production93_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}