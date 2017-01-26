package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_371 {
    private final Production93_371 production = new Production93_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}