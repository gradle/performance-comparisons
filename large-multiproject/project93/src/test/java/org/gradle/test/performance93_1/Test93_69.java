package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_69 {
    private final Production93_69 production = new Production93_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}