package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_477 {
    private final Production93_477 production = new Production93_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}