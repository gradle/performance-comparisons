package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_395 {
    private final Production93_395 production = new Production93_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}