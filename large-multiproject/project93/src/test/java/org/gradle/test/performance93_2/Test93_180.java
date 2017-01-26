package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_180 {
    private final Production93_180 production = new Production93_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}