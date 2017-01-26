package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_150 {
    private final Production93_150 production = new Production93_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}