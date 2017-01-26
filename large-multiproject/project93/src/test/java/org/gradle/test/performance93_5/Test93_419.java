package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_419 {
    private final Production93_419 production = new Production93_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}