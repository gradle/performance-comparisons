package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_343 {
    private final Production93_343 production = new Production93_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}