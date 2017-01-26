package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_235 {
    private final Production93_235 production = new Production93_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}