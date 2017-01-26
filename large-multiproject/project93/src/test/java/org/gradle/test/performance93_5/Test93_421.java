package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_421 {
    private final Production93_421 production = new Production93_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}