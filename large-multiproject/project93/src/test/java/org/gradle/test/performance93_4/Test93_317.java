package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_317 {
    private final Production93_317 production = new Production93_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}